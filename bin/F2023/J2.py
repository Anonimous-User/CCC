thisdict = {
    "Poblano": 1500,
    "Mirasol": 6000,
    "Serrano": 15500,
    "Cayenne": 40000,
    "Thai": 75000,
    "Habanero": 125000
}
number = (int)(input())
out = 0
while number!=0:
    pepper = input()
    out = out+thisdict[pepper]
    number = number-1
print(out)