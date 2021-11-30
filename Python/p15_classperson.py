# -*- coding: utf-8 -*-
"""
Created on Tue Nov 30 13:43:40 2021

@author: ustjavasdetb409
"""

class Person:
  def __init__(self, name, age):
    self.name = name
    self.age = age

  def myfunc(self):
    print("Hello my name is " + self.name)

p1 = Person("John", 36)
p1.myfunc()