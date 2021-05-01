# Homework 2

Name: Bryce Ong
PID: A16287711
Account: cs15lsp21kq

## Getting Started

Login to your 15L account either from a lab machine or via `ssh`. From your
home directory, enter the following commands:

```
$ gethw
$ cd ~/homework/hw2
$ vim hw2.md
```

Answer these questions in the `hw2.md` file you now have open.

_Don't forget to change the file header!_

**REMINDER: You do not need to edit the hw2.c file**

1. Please take a look at the code in `hw2.c`. You may use this code to
answer questions 2 through 7. (_hint:_ you can compile this code by typing
`gcc -std=c99 -o hw2 -g hw2.c`, and you can run it by typing `./hw2`. For this
question, let's assume you're taking CSE 12 and the PA is due in 25 minutes.
Yikes! When you run your program with the command: `./hw2`, the output is not
what you expect. Instead, it seems like `is_prime` always returns false! You can
try this on your own!

    1. Which file descriptor is `expected: number 1999 is prime -> true` sent to? **(0.5 points)**

            stderr

    2. Which file descriptor is `output: number 1999 is prime -> false` sent to? **(0.5 points)**

            stdout

2. What is the command to debug `hw2.c` using GDB, assuming that the
corresponding executable is named `hw2`? Assume your current directory includes
the executable. **(1 point)**

        gdb hw2

3. You want to set a breakpoint in the function `main`.

    1. What is one way to set a breakpoint in `main`? **(0.5 points)**

            break main

    2. What is another way to set a breakpoint, different from the solution you
    provided in part 1? (_hint:_ Remember that shorthands such as `bt` for 
    `backtrace` are not considered different) **(0.5 points)**

            tbreak main

4. At some point during debugging, you see the following being printed *after*
you typed in "next": `22 input = 1999;`. What will be printed if you enter
`print input`? **(1 point)**

        0

5. Following question 4, which is the next line to execute if you enter `next`? 
**(1 point)**

        input = 1999 will be executed

6. Say you are on this line: `23 output = is_prime(input);`. What is a command
in GDB that will bring your debugging INTO the function `is_prime()`? (_hint:_
this is different than staying within the `main` method) **(1 point)**

        step

7. Let's say we want to see the value of output after `is_prime()` is finished. 
We can first enter the following command, `break 32` in GDB. From the previous 
problem, what is one command that will run the program until the new breakpoint
that we just created? **(1 point)**

        c

8. Now quit GDB. Let's say you've fixed the bug in your code. Nice! Now you
want to save the output printed by your program in order to compare with a
reference solution. What is a command to use in order to redirect *only* the
standard output of `./hw2` to a file named `my_output`? **(1 point)**

        ./hw2 > my_output

9. Assume that you have a reference solution file named `ref_output` that
contains the expected output of this PA. What is the command to help you check
whether `my_output` and `ref_output` have any differences? **(1 point)**

        diff my_output ref_output

10. Your solution looks perfect. Good job! Now, you are worried if your program
has any memory violations, so there are yet more things to check. Using the
program described in lecture, what is the complete command that can help you
check for any potential memory issues, like memory leaks or invalid memory
accesses in your `hw2` executable? (_hint:_ it is not simply  `make valgrind`!) 
**(1 point)**

        valgrind ./hw2

11. You have a file called `CSEInstructors.txt` that contains over 10,000 lines
listing the names and instructors of all CSE courses offered every quarter
from 2002. However, you’re only interested in lines that contain the course name
`15L`. For the following questions, try making a small tester file to make
sure your commands work correctly.

    1. What is the command that displays all lines containing the phrase 
    `15L` with their corresponding line numbers in CSEInstructors.txt and outputs 
    them to a file with the name `SoftwareTools.txt`? **(0.5 points)**

            grep -ni 15L CSEInstructors.txt > SoftwareTools.txt
 
    2. We want to count the number of lines that contain the phrase `15L`.
    What is the command? **Do NOT send the output to a file for this command.**
    Hint: Check out `man grep` for  available options! **(0.5 points)**
            
            grep -c 15L CSEInstructors.txt

12. From Lab 2, why did we run the command `make` after entering `cd ~/hw0` on the 
command line? **(1 point)**

        It is to build and compile all the programs and libraries within the hw0 directory using the specifications given by the Makefile.

13. What were the two problems that valgrind found initially in the `hw0.c` 
program from Lab 2? **(1 point)**

        The first problem was that there was an unitialised value (UMR) in hw0.c. The second problem was that there was a memory leak in hw0.c.

## Turnin Procedure:
Be sure your `hw2.md` file is saved on your 15L account in the directory
`~/homework/hw2`. When logged into your 15L account, enter the following
commands:
```
$ cd ~/homework/hw2
$ turnin15L
```
Follow the Autograder prompts, using your UC San Diego email login credentials,
and you should be good to go! Make sure you get the confirmation email from
Autograder. Additionally, you can log in to Autograder to verify your submission.
