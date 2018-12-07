print("Enter input")
z = input()

f = open("NCHS_-_Leading_Causes_of_Death_United_States.csv","r")

print(f.readline())
print(" ")
for x in f:
    if z.lower() in x.lower():
        print(x)