n = 29
binary = bin(n)[-2:]       # Get last two characters of binary representation
octal = oct(n)[-2:]        # Get last two characters of octal representation
hexadecimal = hex(n)[-2:]  # Get last two characters of hexadecimal representation

print("Binary last two digits:", binary)
print("Octal last two digits:", octal)
print("Hexadecimal last two digits:", hexadecimal)