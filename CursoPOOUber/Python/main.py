from car import Car

if __name__=="__main__":
    print("HOLA PYTHON ++30")

    car=Car()
    car.license="YHT34N"
    car.driver="MIGUEL RUIZ"
    car.passegenger=5
    print(vars(car))

    car2=Car()
    car2.license="IJG87D"
    car2.driver="NESTOR ROMO"
    car2.passegenger= 6
    print(vars(car2))
