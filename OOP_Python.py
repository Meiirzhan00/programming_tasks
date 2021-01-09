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
