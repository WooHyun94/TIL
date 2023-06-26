from rest_framework import serializers
from .models import Mobile

class MobileSerializer(serializers.ModelSerializer):
    class Meta:
        model = Mobile
        fields = ("usr_id", "usr_pw", "best_score")

class UserSerializer(serializers.Serializer):
    class Meta:
        model = Mobile
        fields = ("usr_id", "usr_pw", "best_score")