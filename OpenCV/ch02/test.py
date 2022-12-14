import cv2
import sys
import numpy as np

image = cv2.imread('cat.bmp')

if image is None:
    print('open failed')
    sys.exit()

cv2.imshow('image', image)
cv2.waitKey()
cv2.destroyAllWindows()