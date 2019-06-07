#include <stdio.h>
#include <math.h>
#include <stdlib.h>
int main (){

	double X1, Y1, 
	       X2, Y2,
	       X3, Y3;
	double a, b, c;

	double X4, Y4, 
	       X5, Y5,
	       X6, Y6;
	double d, e, f;

	double P1, P2;



	printf("Triangle #1:\n");
	printf("Vertex A:\n");
	if (scanf("%lf %lf", &X1, &Y1) !=2){
	printf("Invalid input.\n");
		return 0;}
	
	printf("Vertex B:\n");
	if (scanf("%lf %lf", &X2, &Y2) !=2){
	printf("Invalid input.\n");
		return 0;}

	printf("Vertex C:\n");
	if (scanf("%lf %lf", &X3, &Y3) !=2){
	printf("Invalid input.\n");
		return 0;}

	a = sqrt((X1-X2)*(X1-X2)+(Y1-Y2)*(Y1-Y2));
	b = sqrt((X1-X3)*(X1-X3)+(Y1-Y3)*(Y1-Y3));
	c = sqrt((X2-X3)*(X2-X3)+(Y2-Y3)*(Y2-Y3));



	if   (a+b-c<= 1e-12 *c*c || a+c-b<= 1e-12*b*b || b+c-a<= 1e-12*a*a){
	printf("The points do not form a triangle.\n");
	exit(1);
	}





	printf("Triangle #2:\n");
	printf("Vertex A:\n");
	if (scanf("%lf %lf", &X4, &Y4) !=2){
	printf("Invalid input.\n");
		return 0;}
	
	printf("Vertex B:\n");
	if (scanf("%lf %lf", &X5, &Y5) !=2){
	printf("Invalid input.\n");
		return 0;}

	printf("Vertex C:\n");
	if (scanf("%lf %lf", &X6, &Y6) !=2){
	printf("Invalid input.\n");
		return 0;}




	d = sqrt((X4-X6)*(X4-X6)+(Y4-Y6)*(Y4-Y6));
	e = sqrt((X4-X5)*(X4-X5)+(Y4-Y5)*(Y4-Y5));
	f = sqrt((X5-X6)*(X5-X6)+(Y5-Y6)*(Y5-Y6));

	 P1 = a+b+c;
	 P2 = d+e+f;

	if   (d+e-f<= 1e-12 *f*f || e+f-d<= 1e-12*d*d || d+f-e<= 1e-12*e*e){
	printf("The points do not form a triangle.\n");
	exit(1);
	}
	
	if ((a == d || a == e || a == f) && (b == d || b == e || b ==f) && (c == d || c == e || c == f)) {
	printf("The triangles are identical.\n");
	exit (1);}
	if ((P1 - P2 <= 1e-12 * P2 * P2) && (P2 - P1 <= 1e-12 * P1 * P1))  {
	printf("The triangles are not identical, however, they have the same circumference.\n");
		exit(1);}

	else if (  P1-P2> 1e-12 *P2*P2){
	printf("Triangle #1 has a longer circumference.\n");
	exit(1);}

	else {
	printf("Triangle #2 has a longer circumference.\n");
	exit(1);}




return 0;}
