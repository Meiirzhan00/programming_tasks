from math import *
print(f'cos60 = {cos(60)}')

-------------------------------------

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


------------------------------------------------------------------------

class BMI:
    
    name=input("What is your name : ")
    weight=float(input("How much is your weight:: "))
    height=float(input("How much is your height: "))

    def bmi_calculator(self):
        
        bmi = BMI.weight / (BMI.height ** 2)
        
        print('Body mass index: '+str(bmi))
        if bmi<25:
            return BMI.name+' does not have excess weight !'
        else:
            return BMI.name+' has excess weight !'

bmi1=BMI()
print(bmi1.bmi_calculator())

-------------------------------------------------------------------------

name1='Meiirzhan'
weight1=70
height1=1.80

name2='Mukhamejan'
weight2=75
height2=1.72

def bmi_calculator(name,weight,height):
    
    bmi = weight / (height ** 2)
    
    print('Body mass index: '+str(bmi))
    if bmi<25:
        return name+' does not have excess weight !'
    else:
        return name+' has excess weight !'
        
bmi1=bmi_calculator(name1, weight1, height1)
bmi2=bmi_calculator(name2, weight2, height2)

print(bmi1)
print(bmi2)
