class Person():

  def __init__(self):
    n=int(input("Рow many people do you enter ? "))
    while n>0:
      self.name=input("Input your name: ")
      self.surname=input("Input your surname: ")
      self.place_of_birth=input("Input your place of birthday: ")
      self.year_of_birth=input("Input your year of birthday: ")
      n-=1

  def print_info_person(self):
    return f"name: {self.name} , surname: {self.surname} , place_of_birth: {self.place_of_birth} , year_of_birth: {self.year_of_birth} "
  
  def get_age(self,current_year):
    return f"{self.name} {current_year-int(self.year_of_birth)} years old !"

p1=Person()
print(p1.print_info_person())
print(p1.get_age(2021))
