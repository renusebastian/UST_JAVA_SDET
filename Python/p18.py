# -*- coding: utf-8 -*-
"""
Created on Tue Nov 30 13:50:09 2021

@author: ustjavasdetb409
"""

import json

# some JSON:
x = '{ "name":"John", "age":30, "city":"New York"}'

# parse x:
y = json.loads(x)

# the result is a Python dictionary:
print(y["age"])
