total = 0
totalTemp = 0
final = ""
temp = ""

try:  # Check for any invalid inputs
    N = int(input("Enter Number N: "))  # Take input for N

    P = int(input("Enter Number P: "))  # Take input for P

    while N > pow(10, 15) or P > pow(10, 15):  # Take inputs again if they are bigger than 10^15
        print("One or more value is too big ")
        N = int(input("Enter Number N: "))
        P = int(input("Enter Number P: "))

except:  # if any errors occur exit program
    print("A fatal error occurred please recheck your inputs")
    exit()

P -= 1  # Simple change to P input to make it calibrated to the code

number = str(N)

numInvertStr = number[::-1]  # Invert the N input
power = numInvertStr[P]

for i in range(len(number[P + 1:])):  # A for loop to take care of the left side of the N string
    multiply = int(number[i]) + int(power)  # the equation to take care of left side
    strMultiply = str(multiply)
    strMultiply = strMultiply[::-1]  # invert the list we created one line above
    final = str(final) + strMultiply[0]  # add the numbers one by one

final = str(final) + power  # place the number at P index in its correct place

for i in range(len(number[:P + 1])):  # for loop to take care of right side
    if i:  # to check for when its not 0 because I got confused and can't do it any other way
        temp = (temp + str(abs(int(number[-i]) - int(power))))  # create a temp variable and store the right side in it

temp = temp[::-1]  # invert temp
final = str(final) + temp  # combine the left and right side
print(final)  # print out the end
