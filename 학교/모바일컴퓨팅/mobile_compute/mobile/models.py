from django.db import models

# Create your models here.
class Mobile(models.Model):
    usr_id = models.CharField(max_length=20, primary_key=True)
    usr_pw = models.CharField(max_length=20)
    best_score = models.IntegerField()