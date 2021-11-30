# -*- coding: utf-8 -*-
"""
Created on Tue Nov 30 13:52:40 2021

@author: ustjavasdetb409
"""

import re

#Split the string at every white-space character:

txt = "The rain in Spain"
x = re.split("\s", txt)
print(x)
f = open("demofile.txt", "r")
for x in f:
  print(x)
