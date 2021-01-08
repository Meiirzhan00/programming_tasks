from math import *
print(f'cos60 = {cos(60)}')

class Circle:
    
    PI = 3.14
    
    def __init__(self,radius):
        self.radius=radius
        
    def perimeter(self):
        return 2 * Circle.PI * self.radius
    
    def area(self):
        return Circle.PI * self.radius ** 2
        
c1=Circle(3)
print(c1.perimeter())
print(c1.area())

c2 = Circle(7)
print(c2.perimeter())
print(c2.area())
