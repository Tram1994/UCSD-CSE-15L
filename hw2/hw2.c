#include <stdio.h>

int is_prime(int num) {
    if (num < 2) {
        return 0;
    }

    for (int ind = 1; ind <= num / 2; ++ind) {
        if (num % ind == 0) {
            return 0;
        }
    }

    return 1;
}

int main() {
    int input = 0;
    int output = 0;
    char * str_result;

    input = 1999;
    output = is_prime(input);
    
    if (output) {
        str_result = "true";
    }
    else {
        str_result = "false";
    }

    fprintf(stderr, "expected: number %d is prime -> %s\n", input, "true");
    printf("output: number %d is prime -> %s\n", input, str_result);

    return 1;
}
