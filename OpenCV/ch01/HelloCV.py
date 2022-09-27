import cv2 
import sys 
import os

print('Hello, OpenCV', cv2.__version__)

img = cv2.imread('C:/Users/94dng/Documents/dev/TIL/OpenCV/ch01/cat.bmp',flags=cv2.IMREAD_GRAYSCALE)

if img is None:
    print('Image load failed!')
    sys.exit()

#cv2.imwrite('cat_gray.png', img)
cv2.namedWindow('image') #,cv2.WINDOW_NORMAL
cv2.imshow('image', img)
cv2.waitKey()

cv2.destroyAllWindows()