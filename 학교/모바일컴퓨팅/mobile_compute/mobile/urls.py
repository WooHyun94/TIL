from django.urls import path

from mobile import views
from .views import create_data

app_name = 'mobile'
urlpatterns = [
    path('search/', views.MobileAPIView.as_view(), name='mobile_serch_api'),
    path('exit/<str:usr_id>/<str:usr_pw>/<int:best_score>/', views.UserScoreUpdateView.as_view(), name='user-score-update'),
    path('create/', create_data, name='create_data'),
]
