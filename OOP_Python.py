class BMI:
    
    name=input("What is your name : ")
    weight=float(input("How much is your weight: "))
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

-------------------------------------------------------------

class Person:

  name=input("Input your name: ")
  surname=input("Input your surname: ")
  place_of_birth=input("Input your place of birthday: ")
  year_of_birth=input("Input your year of birthday: ")

  def print_info_person(self):
    return f"name: {Person.name} , surname: {Person.surname} , place_of_birth: {Person.place_of_birth} , year_of_birth: {Person.year_of_birth} "
  
  def get_age(self,current_year):
    return f"{Person.name} {current_year-int(Person.year_of_birth)} years old !"

p1=Person()
print(p1.print_info_person())
print(p1.get_age(2021))
