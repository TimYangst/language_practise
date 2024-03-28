#!/usr/bin/python
# -*- coding: UTF-8 -*-

string1 = "abcde"

print(string1[-1]);
print(string1[1:-1]);
print(string1[1:3]);

tuple1 = ("a", "b", "c");
print(tuple1.index("c"), tuple1[1]);

def myFun(arg1, arg2, arg3):
    print("arg1:", arg1)
    print("arg2:", arg2)
    print("arg3:", arg3)

# # Now we can use *args or **kwargs to
# # pass arguments to this function :
# args = ("Geeks", "for", "Geeks")
# myFun(*args)

kwargs = {"arg2": "Geeks", "arg1": "for", "arg3": "Geeks"}
myFun(**kwargs)


# Return double of n
def addition(n):
    return n + n

# We double all numbers using map()
numbers = (1, 2, 3, 4)
result = map(addition, numbers)

# print(type(result))
# print(list(result))

i=0;
for tmp in result:
    i+=1
    print(i)
    print(tmp)
    
    
list1 = [1,2,3,4]
print(len(list1))


    
