#include <stdio.h>
#include <string.h>

int main() {
    char bin[50], ones[50], twos[50];
    int i, carry = 1;

    // Input binary number
    printf("Enter a binary number: ");
    scanf("%s", bin);

    // 1's Complement
    for(i = 0; bin[i] != '\0'; i++) {
        if(bin[i] == '0')
            ones[i] = '1';
        else
            ones[i] = '0';
    }
    ones[i] = '\0'; // Null terminate the string

    // 2's Complement
    for(i = strlen(ones) - 1; i >= 0; i--) {
        if(ones[i] == '1' && carry == 1) {
            twos[i] = '0';
        } else if(ones[i] == '0' && carry == 1) {
            twos[i] = '1';
            carry = 0;
        } else {
            twos[i] = ones[i];
        }
    }
    twos[strlen(ones)] = '\0';

    // Output results
    printf("\nOriginal Binary : %s", bin);
    printf("\n1's Complement  : %s", ones);
    printf("\n2's Complement  : %s\n", twos);

    return 0;
}
