In this program, we define an interface called Exam with a single method called Percent_cal, which takes an array of marks as input and returns the percentage calculated from those marks.

We then create a class called Result that implements the Exam interface. The Percent_cal method in this class calculates the percentage as the average of the marks in the input array, and the display method prints the percentage to the console.

Finally, we create a class called Student that extends the Result class. This class has three attributes: name, rollNo, and marks, which represent the name of the student, their roll number, and their marks in three subjects. The printInfo method in this class prints out the name, roll number, and percentage calculated from the marks to the console using the display method inherited from the Result class.

In the main method of the Main class, we create a new Student object with some sample marks, and then call the printInfo method to display the student's information and percentage to the console.




