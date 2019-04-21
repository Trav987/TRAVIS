#include <stdio.h>
#include <stdlib.h>
#include <string.h>
#include <math.h>
#include <Arduino.h>
#define MAX 1000
#define PI 3.141593

void readData(float* x, float* y, float* z)
{
  FILE *fp;
  char str[10];
  //char ptr;
  char* filename = "Coor.txt";
  float w;
  char *end;

  fp = fopen(filename, "r");
  if(fp == NULL)
  {
    printf("Could not open file %s\n", filename);
    //return 1;
  }
  if(fp)
  {
    while (fscanf(fp, "%s %f",str, &w) != EOF)
    {
      if(!strcmp(str,"x:"))
      {
        *x = w;
        //return x;//printf("%d\n", x);
      }
      else if(!strcmp(str,"y:"))
      {
        *y = w;
        //return y;//printf("%d\n", x);

      }
      else if(!strcmp(str,"z:"))
      {
        *z = w;
        //return z;//printf("%d\n", x);
      }
      else
      {
        continue;
      }
      //printf("%s\n %d\n",str, x);
    }
  }
  //return x,y,z ;
  fclose(fp);
  //return 0;
}
int xROT(float *xCo, float *yCo)
{
  float hyp;//= 1.0;//this is the Hypotenuse
  float deg;//this for degrees
  float x, y; //coordinates
  float rot; //determines the amount it should rotate
  x = *xCo;
  y = *yCo;
  hyp = sqrt((pow(x,2)+pow(y,2)));// gets Hypotenuse
  printf("%f\n",hyp);
  deg = asin(y/hyp);//uses this to get the degree of rotation
  deg = deg*(180/PI); //converts from radian to degree
  if(deg < 0.0)
  {
    deg = deg + 360.0;
  }
  printf("%f\n",deg);
  rot = deg/2.12; //converts this into a dmx output
  //printf("%d",rot);
  return rot;
}

int yROT(float *yCo, float *zCo)
{
  float hyp; //= 1.0;//this is the Hypotenuse
  float deg;//this for degrees
  float y, z; //coordinates z is opposite and y is needed to get Hypotenuse
  float rot; //determines the amount it should rotate
  y = *yCo;
  z = *zCo;
  //hyp = sqrt((pow(z,2)+pow(y,2)));// gets Hypotenuse
  deg = asin(y/hyp);//uses this to get the degree of rotation
  deg = deg*(180/PI); //converts from radian to degree
  rot = deg/2.12; //converts this into a dmx output
  return rot;
}

int main(void)
{
    init();

#if defined(USBCON)
    USBDevice.attach();
#endif

  //  setup();

  float x,y,z;
  int pan, tilt;
  while(1)
  {
    readData(&x,&y,&z);
    pan = xROT(&x,&y);
  }
  if (serialEventRun) serialEventRun();
  //tilt = yROT(&y,&z);
//  printf("%f\n", pan);
  return 0;


}
