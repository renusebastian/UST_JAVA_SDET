# -*- coding: utf-8 -*-
"""
Created on Tue Nov 30 13:03:24 2021

@author: ustjavasdetb409
"""

# Python program to swap two variables

x = 5
y = 10	

# To take inputs from the user
#x = input('Enter value of x: ')
#y = input('Enter value of y: ')

# create a temporary variable and swap the values
temp = x
x = y
y = temp

print('The value of x after swapping: {}'.format(x))
print('The value of y after swapping: {}'.format(y))
