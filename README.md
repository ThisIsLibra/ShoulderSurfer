# ShoulderSurfer
Generate a list of strings based on a given input with uncertain characters and the keyboard lay-out.

The default keyboard lay-out is US-International with numpad support for digits. 

The constant String 'DIVIDER' is used to mark characters in a string as 'uncertain'. The default value is a question mark.

The input for ShoulderSurfer is simple:

1. Provide the input.
2. Wait for the output to be displayed, this takes longer with more uncertain characters, because all possibilities are shown. 
3. Use the given list instead of brute forcing all possible options

## Example
Input: ?asdf
Output:
qsdf
Qsdf
asdf
Asdf
ssdf
Ssdf
wsdf
Wsdf
xsdf
Xsdf
zsdf
Zsdf

The character 'a' is uncertain. The keyboard has the keys q, w, a, s, z and x mapped close to the character 'a'. Additionally, capital letters are also included. The total amount of combinations equals 12 for the uncertain letter 'a'.

If the input has more uncertain characters, the total amount of options equal 'amount of combinations first uncertain letter' * 'amount of combinations second uncertain letter' * 'amount of combinations n-th uncertain letter'.

# License and Usage
The software is licensed under GNU General Public License v3.0. Illegal usage, such as creating lists of possible passwords used to hack without permission, is absolutely forbidden.

# Contact
If you want to contact me about this application, please e-mail me at [info][at][maxkersten][dot][nl].
