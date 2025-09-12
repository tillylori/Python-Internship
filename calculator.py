title= print("CALCULATOR MENU")

numb1= input("Enter your first number: ")
num1=int(numb1)
numb2= input("Enter your second number: ")
num2=int(numb2)
opp = input("Pick an Operator for your calculation( + - * / ): ")

match opp:
    case '+' :
        print(str(num1 + num2))

    case '-' :
        print(str(num1 - num2))

    case '*' :
        print(str(num1 * num2))

    case '/' :
        print(str(num1 / num2))
    
    case _ :
        print("System Error")


