















# 
# people = {"Amit": 20, "Riya": 17, "Rahul": 22, "Neha": 16}
# 
# for name, age in people.items():
#     if age > 18:
#         print(name)








# 
# t = (4, 7, 4, 9, 2)
# print("Count of 4:", t.count(4))
# print("Index of 9:", t.index(9))



# 
# text = "Hello Python Programming"
# 
# print(text.upper())
# print(text.lower())
# print(text.replace("Python", "AI"))
# print(text.find("Programming"))
# print(text.split())
# 
# 
# class Student:
#     def __init__(self, name):
#         self.name = name
# 
# s = Student("Amit")
# print(s.name)






# class Demo:
#     @staticmethod
#     def show():
#         print("Static method")
#         
# Demo.show()





# # Overloading using default arguments
# def add(a=0, b=0, c=0):
#     return a + b + c
# 
# print(add(2,3))
# print(add(2,3,4))
# 
# # Overriding Example
# class A:
#     def show(self):
#         print("Parent class")
# 
# class B(A):
#     def show(self):
#         print("Child class")
# 
# B().show()




# class Demo:
#     x = 100  # class variable
# 
#     def show(self):
#         print("Instance method")
# 
#     @classmethod
#     def display(cls):
#         print("Class method:", cls.x)
# 
# obj = Demo()
# obj.show()
# Demo.display()
# 








# 
# 
# from abc import ABC, abstractmethod
# 
# class Shape(ABC):
#     @abstractmethod
#     def area(self):
#         pass
# 
# class Circle(Shape):
#     def area(self):
#         print("Area = πr²")
# 
# Circle().area()








# class A:
#     def show(self):              # Instance method
#         print("Instance method")
# 
#     @classmethod
#     def display(cls):            # Class method
#         print("Class method")
# 
#     @staticmethod
#     def info():                  # Static method
#         print("Static method")
# 
#     class Inner:
#         def inner_msg(self):
#             print("This is inner class")
# 
# A.Inner().inner_msg()










# 
# class Parent:
#     def __init__(self, name):
#         self.name = name
# 
# class Child(Parent):
#     def __init__(self, name):
#         super().__init__(name)
# 
# obj = Child("Amit")
# print(obj.name)
# 
# 







# class Animal:
#     def sound(self):
#         print("Animal sound")
# 
# class Dog(Animal):
#     def sound(self):
#         print("Bark")
# 
# 
# def speak(obj):
#     obj.sound()
# 
# speak(Animal())
# speak(Dog())
# 






# 
# try:
#     a = float(input("Enter first number: "))
#     b = float(input("Enter second number: "))
#     print("Sum =", a + b)
# 
# except TypeError:
#     raise TypeError("Inputs must be numerical values")
# 
# 



# 
# 
# try:
#     a = int(input("Enter numerator: "))
#     b = int(input("Enter denominator: "))
#     print("Result =", a / b)
# 
# except ArithmeticError:
#     raise ArithmeticError("Error: Cannot divide by zero")
# 
# 







# 
# x = int(input("Enter positive number: "))
# assert x > 0, "Number must be positive"
# print("Valid number")
# 
# 
# 


f = open("sample.txt", "r")
print(f.tell())       # position
f.seek(5)             # move pointer to 5th byte
print(f.read())
f.close()









# 
# class Demo:
# #     x = 100  # class variable
# # 
# #     def show(self):
# #         print("Instance method")
# # 
# #     @classmethod
# #     def display(cls):
# #         print("Class method:", cls.x)
# # 
# # obj = Demo()
# # obj.show()
# # Demo.display()
# # 
# 
# 
# 
# 
# # Method Overriding
# class A:
#     def area(self):
#         print("Area of shape")
# 
# class B(A):
#     def area(self):
#         print("Area of rectangle")
# # 
# obj = B()
# obj.area()
# 
# 
# 
# # Overloading (using default arguments)
# def greet(name="User"):
#     print("Hello", name)
# 
# greet("Ravi")
# greet()
# 
# 

# 
# from abc import ABC, abstractmethod
# 
# class Shape(ABC):       # Abstract class
#     @abstractmethod
#     def area(self):     # Abstract method (no body)
#         pass
# 
# class Circle(Shape):    # Child class
#     def area(self):
#         print("Area = πr²")
# 
# c = Circle()
# c.area()
# 


# 
# class Parent:
#     def __init__(self, name):
#         self.name = name
# 
# class Child(Parent):
#     def __init__(self, name):
#         super().__init__(name)
# 
# obj = Child("Amit")
# print(obj.name)
# 
# 



# 
# 
# class A:
#     def __init__(self, x):
#         self.x = x
#     def __add__(self, other):
#         return self.x + other.x
# 
# obj1 = A(5)
# obj2 = A(10)
# print(obj1 + obj2)


# 
# try:
#     x = int("abc")
# except ValueError:
#     print("Invalid value")
# 



# 
# 
# 
# 
# try:
#     a = float(input("Enter first number: "))
#     b = float(input("Enter second number: "))
#     print("Sum =", a + b)
# 
# except ValueError:
#     raise print("Inputs must be numerical values")
# 
# 
# 
# 








# try:
#     lst = [1, 2, 3]
#     lst.append(4)
#     lst.sort()
#     lst.fake_method()     # non-existent attribute
# 
# except AttributeError:
#     print("AttributeError caught: Method does not exist")






# 
# 
# 
# 
# try:
#     a = int(input("Enter numerator: "))
#     b = int(input("Enter denominator: "))
#     print("Result =", a / b)
# 
# except ArithmeticError:
#     print("Error: Cannot divide by zero")
















# 
# try:
#     a = int(input("Enter first number: "))
#     b = int(input("Enter second number: "))
#     if b == 0:
#         raise ZeroDivisionError("Denominator cannot be zero")
#     # print("Quotient =", a / b)
# 
# except ZeroDivisionError as e:
#     print(e)





# 
# try:
#     f = open("hi.txt", "r")  # protected file
#     print(f.read())
# 
# except PermissionError:
#     print("Permission denied: Not allowed to open this file")




# 
# 
# class EmptyListError(Exception):
#     pass
# 
# try:
#     nums = input("Enter numbers separated by space: ").split()
#     if len(nums) == 0:
#         raise EmptyListError("List cannot be empty")
# 
#     nums = list(map(float, nums))
#     avg = sum(nums) / len(nums)
#     print("Average =", avg)
# 
# except EmptyListError as e:
#     print("Error:", e)












# 
# store/
#     __init__.py
#     inventory.py
#     orders.py
#     payment.py
# 
# 
# from store.inventory import show_products
# from store.orders import place_order
# from store.payment import pay
# 
# print(show_products())
# print(place_order("Laptop", 2))
# print(pay(90000))








# 
# x = int(input("Enter positive number: "))
# assert x > 0, "Number must be positive"
# print("Valid number")








# 
# try:
#     n = int(input("Enter a number: "))
#     print("You entered:", n)
# 
# except KeyboardInterrupt:
#     print("\nInput cancelled by user. Program terminated gracefully.")









# 
# # Writing binary
# data = b"Hello Binaryffghhjjhhjjjb"
# f = open("binfile.txt", "wb")
# f.write(data)
# f.close()
# 
# # # Reading binary
# f = open("binfile.txt", "rb")
# print(f.read())
# f.close()









# with open("test.txt", "w") as f:
#     f.write("Using with statement")
# 
# 


# 
# f = open("test.txt", "r")
# print(f.tell())       # position
# f.seek(13)             # move pointer to 5th byte
# print(f.read())
# f.close()







# 
# 
# 
# def count_the():
#     count = 0
#     with open("test.txt", "r") as file:
#         for line in file:
#             words = line.lower().split()
#             count += words.count("the" )
#             count += words.count("is" )
#     print("Total occurrences of 'the' =", count)
# 
# count_the()
# 


# 
# 
# def hash_display():
#     with open("test.txt", "r") as file:
#         text = input(file.read().strip())
#         formatted = "#".join(text)
#         print(formatted)
# 
# hash_display()






# 
# import tkinter as tk
# 
# root = tk.Tk()
# root.title("My First GUI")
# root.geometry("300x200")
# 
# label = tk.Label(root, text="Hello GUI")
# label.pack()
# 
# root.mainloop()




# 
# import pickle
# 
# def createFile():
#     file = open("Book.dat", "ab")
#     BookNo = int(input("Enter Book Number: "))
#     Book_Name = input("Enter Book Name: ")
#     Author = input("Enter Author Name: ")
#     Price = float(input("Enter Price: "))
#     rec = [BookNo, Book_Name, Author, Price]
#     pickle.dump(rec, file)
#     file.close()
# 
# def countRec(author):
#     file = open("Book.dat", "rb")
#     count = 0
#     try:
#         while True:
#             rec = pickle.load(file)
#             if rec[2].lower() == author.lower():
#                 count += 1
#     except EOFError:
#         pass
#     file.close()
#     return count
# 
# 
# createFile()
# print(countRec("RK Narayan"))

# 
# 
# 
# 
# 
# 
# 
# 
# 
# 
# 
# student = {"name": "Riya", "age": 20, "marks": 85}
# 
# print(student.keys())
# print(student.values())
# print(student.items())
# 
# student.update({"age": 21})
# print(student)
# 
# student.pop("marks")
# print(student)




# 
# def fun(*numbers):
#     print(numbers)
# fun(1, 2, 3)


# 
# class Student:
#     def __init__(self, name):
#         self.name = name
# 
# s = Student("Amit")
# print(s.name)





# 
# class Demo:
#     @staticmethod
#     def show():
#         print("Static method")
# 
#     @classmethod
#     def display(cls):
#         print("Class method")
# 
# 
# 
# class MyClass:
#     @staticmethod
#     def add(a, b):
#         return a + b
#     





# from abc import ABC, abstractmethod
# 
# class Shape(ABC):
#     @abstractmethod
#     def area(self):
#         pass





# 
# class A:
#     def show(self):
#         print("Parent")
# 
# class B(A):
#     def show(self):
#         super().show()
#         print("Child")
#         
# B= B()
# B.show()






# Overloading using default arguments
# def add(a=0, b=0, c=0):
#     return a + b + c
# 
# 
# print(add(2,3))
# print(add(2,3,4))
# 
# # Overriding Example
# class A:
#     def show(self):
#         print("Parent class")
# 
# class B(A):
#     def show(self):
#         print("Child class")
# 
# B().show()
# 




# 
# class Student:
#     def __init__(self, name, age):
#         self.name = name
#         self.age = age
# 
# s1 = Student("Riya", 20)
# print(s1.name, s1.age)












# 
# 
# class Demo:
#     x = 100  # class variable
# 
#     def show(self):
#         print("Instance method")
# 
#     @classmethod
#     def display(cls):
#         print("Class method:", cls.x)
# 
# obj = Demo()
# obj.show()
# obj.display()



# 
# class A: pass
# class B: pass
# class C(A, B): pass
# 
# print(C.mro())





# from abc import ABC, abstractmethod
# 
# class Vehicle(ABC):       # Interface-like structure
#     @abstractmethod
#     def start(self):
#         pass
# 
# class Car(Vehicle):
#     def start(self):
#         print("Car starts with key")
# 
# class Bike(Vehicle):
#     def start(self):
#         print("Bike starts with kick")
# 
# c = Car()
# b = Bike()
# c.start()
# b.start()






# class A:
#     def show(self):              # Instance method
#         print("Instance method")
# 
#     @classmethod
#     def display(cls):            # Class method
#         print("Class method")
# 
#     @staticmethod
#     def info():                  # Static method
#         print("Static method")
# 
#     class Inner:
#         def inner_msg(self):
#             print("This is inner class")
# 
# obj = A()
# obj.display()
# obj.info()
# obj.Inner()
# A.Inner().inner_msg()











# 
# class Animal:
#     def sound(self):
#         print("Animal sound")
# 
# class Dog(Animal):
#     def sound(self):
#         print("Bark")
# 
# def speak(obj):
#     obj.sound()
# 
# speak(Animal())
# speak(Dog())




# from abc import ABC, abstractmethod
# 
# class Shape(ABC):
#     @abstractmethod
#     def area(self):
#         pass
# 
# class Circle(Shape):
#     def __init__(self, r):
#         super().__init__()
#         self.r = r
#     def area(self):
#         print(3.14 * self.r * self.r)
# 
# Circle(5).area()




# 
# try:
#     a = float(input("Enter first number: "))
#     b = float(input("Enter second number: "))
#     print("Sum =", a + b)
# 
# except  ValueError as e:
#      raise TypeError("Inputs must be numerical values")
# 
# 
# 

# 
# try:
#     lst = [1, 2, 3]
#     lst.append(4)
#     lst.sort()
#     lst.fake_method()     # non-existent attribute
# 
# except AttributeError:
#     raise AttributeError("AttributeError caught: Method does not exist")




# try:
#     a = int(input("Enter first number: "))
#     b = int(input("Enter second number: "))
#     if b == 0:
#         raise ZeroDivisionError("Denominator cannot be zero")
#     print("Quotient =", a / b)
# 
# except ZeroDivisionError :
#     raise ZeroDivisionError("cannot divide by zero")
# 




# 
# try:
#     f = open("/etc/password.txt", "r")  # protected file
#     print(f.read())
# 
# except PermissionError:
#     print("Permission denied: Not allowed to open this file")



# 
# class Animal:
#     def sound(self):
#         print("Animals make sound")
# 
# class Dog(Animal):
#     def sound(self):
#         print("Dog barks")
# 
# d = Dog()
# d.sound()   # overridden version will run




# 
# class EmptyListError(Exception):
#     pass
# 
# try:
#     nums = input("Enter numbers separated by space: ").split()
#     if len(nums) == 0:
#         raise EmptyListError("List cannot be empty")
# 
#     nums = list(map(float, nums))
#     avg = sum(nums) / len(nums)
#     print("Average =", avg)
# 
# except EmptyListError as e:
#     print("Error:", e)









# 
# x = int(input("Enter positive number: "))
# assert x > 0, "Number must be positive"
# print("Valid number")







# 
# try:
#     n = int(input("Enter a number: "))
#     print("You entered:", n)
# 
# except KeyboardInterrupt:
#     print("\nInput cancelled by user. Program terminated gracefully.")






# import pickle
# 
# data = {"name": "Riya", "age": 20}
# 
# # Pickling
# with open("data.pkl", "wb") as f:
#     pickle.dump(data, f)
# 
# # Unpickling
# with open("data.pkl", "rb") as f:
#     obj = pickle.load(f)
#     print(obj)









# import pickle
# 
# def createFile():
#     file = open("Book.dat", "ab")
#     BookNo = int(input("Enter Book Number: "))
#     Book_Name = input("Enter Book Name: ")
#     Author = input("Enter Author Name: ")
#     Price = float(input("Enter Price: "))
#     rec = [BookNo, Book_Name, Author, Price]
#     pickle.dump(rec, file)
#     file.close()
# 
# def countRec(author):
#     file = open("Book.dat", "rb")
#     count = 0
#     try:
#         while True:
#             rec = pickle.load(file)
#             if rec[2].lower() == author.lower():
#                 count += 1
#     except EOFError:
#         pass
#     file.close()
#     return count
# 
# # ---- MAIN CODE ----
# # First create records
# createFile()   # run once or multiple times
# 
# # Now count
# author_name = input("Enter author name to search: ")
# print("Total books by", author_name, "=", countRec(author_name))








import pickle

def addEmp():
    with open("employee.dat", "ab") as f:
        code = int(input("Code: "))
        name = input("Name: ")
        salary = float(input("Salary: "))
        pickle.dump({"code": code, "name": name, "salary": salary}, f)

def showHigh():
    with open("employee.dat", "rb") as f:
        found = False
        try:
            while True:
                rec = pickle.load(f)
                print("Reading record:", rec)   # Debug print
                print("Type of salary:", type(rec["salary"]))  # Debug print

                if rec["salary"] > 30000:
                    print("Selected:", rec)
                    found = True

        except EOFError:
            pass

        if not found:
            print("No employee with salary > 30000")

addEmp()
showHigh()









# 
# import pickle
# 
# def filter_games():
#     fin = open("game.dat", "rb")
#     fout = open("basket.dat", "ab")
#     try:
#         while True:
#             rec = pickle.load(fin)
#             if rec[0].lower() == "basket ball":
#                 pickle.dump(rec, fout)
#     except EOFError:
#         pass
#     fin.close()
#     fout.close()
# 
# filter_games()










# import pickle
# import os
# 
# def displayA():
#     if not os.path.exists("players.dat"):
#         print("No data file found: players.dat")
#         return
#     with open("players.dat", "rb") as f:
#         try:
#             while True:
#                 rec = pickle.load(f)
#                 if len(rec) > 1 and isinstance(rec[1], str) and rec[1].startswith("A"):
#                     print(rec)
#         except EOFError:
#             pass
# 
# def countCountry(c=None):
#     if c is None:
#         c = input("Enter country to count: ").strip()
#     if not os.path.exists("players.dat"):
#         print("No data file found: players.dat")
#         return
#     count = 0
#     with open("players.dat", "rb") as f:
#         try:
#             while True:
#                 rec = pickle.load(f)
#                 if len(rec) > 2 and isinstance(rec[2], str) and rec[2].lower() == c.lower():
#                     count += 1
#         except EOFError:
#             pass
#     print("Total players =", count)
# 
# def addRecord():
#     try:
#         code = int(input("Code: "))
#         name = input("Name: ").strip()
#         country = input("Country: ").strip()
#         runs = int(input("Runs: "))
#     except ValueError:
#         print("Invalid input")
#         return
#     with open("players.dat", "ab") as f:
#         pickle.dump([code, name, country, runs], f)
#     print("Record added.")
# 
# if __name__ == "__main__":
#     # demo usage
#     addRecord()
#     displayA()
#     countCountry()   # now prompts for country if not supplied





# 
# f = open("sample.txt", "r")
# print(f.tell())       # position
# f.seek(5)             # move pointer to 5th byte
# print(f.read())
# f.close()
