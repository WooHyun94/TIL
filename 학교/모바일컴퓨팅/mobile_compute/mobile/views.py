from django.shortcuts import render
from rest_framework import viewsets
from .serializers import MobileSerializer
from .models import Mobile
from .serializers import UserSerializer
from rest_framework import status
from rest_framework.parsers import MultiPartParser, FormParser, JSONParser
from rest_framework.response import Response
from rest_framework.views import APIView
from django.http import JsonResponse
from rest_framework.generics import UpdateAPIView
from rest_framework.decorators import api_view

# Create your views here.


class MobileViewSet(viewsets.ModelViewSet):
    queryset = Mobile.objects.all()
    serializer_class = MobileSerializer

class MobileAPIView(APIView):
    parser_classes = (MultiPartParser, FormParser, JSONParser,)
    serializer_class = None
    model_class = None

    def get_queryset(self):
        pass

    def post(self, request, *args, **kwargs):
        data = request.data
        print(data['Username'], data['Password'])

        print(Mobile.objects.filter(usr_id=data['Username'], usr_pw=data['Password']))
        query = list(Mobile.objects.filter(usr_id=data['Username'], usr_pw=data['Password']).values())[0]
        print(query['best_score'])
        if (Mobile.objects.filter(usr_id=data['Username'], usr_pw=data['Password']).values()):
            return JsonResponse({'best_score' : query['best_score']})
        return Response(status=status.HTTP_200_OK)
        


class UserScoreUpdateView(APIView):
    def patch(self, request, usr_id, usr_pw, best_score):
        try:
            user = Mobile.objects.get(usr_id=usr_id, usr_pw=usr_pw)
        except Mobile.DoesNotExist:
            return Response({'error': 'User not found'}, status=404)
        
        user.best_score = best_score
        user.save()
        
        serializer = UserSerializer(user)
        return Response(serializer.data)
    
@api_view(['POST'])
def create_data(request):
    serializer = MobileSerializer(data=request.data)
    if serializer.is_valid():
        serializer.save()
        return Response(serializer.data, status=status.HTTP_201_CREATED)
    return Response(serializer.errors, status=status.HTTP_400_BAD_REQUEST)



