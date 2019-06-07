# Triangles

Program that compares two given triangles in a 2D plane.

There are given two triangles in a 2D plane. Each triangle is defined by three vertices (i.e., there is a total of 6 vertices in the input). The vertices are described by their coordinates (pairs of decimal numbers).Program reads the coordinates from the standard input. Next, the program decides one of the 4 cases:

   1) the input vertices do not form a triangle (the three vertices defining the triangle are on a common line),
   2) the triangles are identical,
   3) the triangles are not identical while their circumference is the same
   4) the triangles are entirely different.

The program validate input data. If the input is invalid, the program will detect it. 



Sample program runs:


Triangle #1:
Vertex A:
0 0
Vertex B:
5 0
Vertex C:
2.5 3
Triangle #2:
Vertex A:
4 -1
Vertex B:
7 1.5
Vertex C:
4 4
The triangles are identical.


Triangle #1:
Vertex A:
0 0
Vertex B:
999.990 204.330
Vertex C:
899.991 183.897
The points do not form a triangle.


Triangle #1:
Vertex A:
1 2
Vertex B:
3 abcd
Invalid input.
