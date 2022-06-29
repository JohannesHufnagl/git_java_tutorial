# Java & Git Tutorial for INSO & SSE Collaboration

Here are the instructions for this tutorial, if you need help, feel free to ask for it or read more details below.

## Instructions:
1. Look at your open issues on GitHub
2. Create a new branch, on which you are working and rename the main file
3. Solve the first exercise in the ``Main.java`` class
4. Commit your solution with a meaningful commit message
5. Solve the next exercise in the ``Main.java`` class
6. Commit your solution with a meaningful commit message
7. Repeat solving and committing all 5 exercises.
8. When you have finished and committed all the exercises, create a pull request for your branch and set another team member to review your pull request.
9. Look at your emails/GitHub if you have to review a pull request yourself and do so if possible.
10. Fix problems on your pull request if your reviewer has found any.
11. Merge your pull request if the reviewer gives her/his ok.
12. Close your issue. -> Finished, excellent!


## Details:

### 1. Look at your open issues on GitHub

Open https://github.com/JohannesHufnagl/git_java_tutorial/issues and look if there is an issue with you assigned to it. 


### 2. Create a new branch, on which you are working

In the GitHub Desktop program, go to the ``git_java_tutorial`` repository and open the current branch tab.
Then click on the "new branch" button and create your own branch, with your name in it.

Now right-click on the Main file in IntelliJ and go to Refactor -> Rename, to give it a new name.
It can be YournameMain for example.

### 3. Solve the first exercise in the ``Main.java`` class

In the first exercise you have to print "Hello World!" to the console. 
To do so, you can use the ``print()`` or ``println()`` function.

For example with: ``System.out.println("Hello SSE!")``, "Hello SSE!" gets printed to the console.
Try it yourself, and don't forget the semicolon :)

### 4. Commit your solution with a helpful commit message

When you have finished the first exercise, you can delete the TODO comment line.
Then you have to commit your changes to your branch. To do so, 
go to GitHub Desktop and write a meaningful commit message before clicking commit to *Your_branch_name*

### 5. Solve the next exercise in the ``Main.java`` class

In the second exercise you have to initialize two integer variables and create the sum of them.
To do so create the two variables you want to sum up and another integer variable called ``sum`` then you can use the ``+`` operator to form the sum of your variables. 

### 6. Commit your solution with a meaningful commit message

When you have finished the second exercise, you can delete the TODO comment line.
Then you have to commit your changes to your branch. To do so,
go to GitHub Desktop and write a meaningful commit message before clicking commit to *Your_branch_name*


### 7. Repeat solving and committing all 5 exercises.

#### Exercise 3:

In exercise three you have to print your sum to the console. For that you can use the same function as in exercise 1, the ``println()``.

If you need help, feel free to ask :)
Don't forget to commit after you finished this exercise!

#### Exercise 4:

In exercise four you have to write code, that can decide if your sum is even or odd. 
Most programming languages, and also Java, have conditions and if statements to do so.

- By using if and else statements, we can perform different actions in our code, based on certain 
conditions.

- The condition which helps us decide if our sum is even or odd is the modulo operator ``%``
The modulo operator performs integer division and returns the remainder.

- When describing an even number we can say: A even number has no remainder when getting divided by 2 

- When describing an odd number we can say: A even number has one as remainder when getting divided by 2

- To compare two values in Java we need the ``==`` operator, which consists of two equal signs.

Now we know everything to solve this exercise.

Here is an example solution, with a small error in it, can you fix it?

```
if (sum % 2 == 1) { 
    System.out.println("even");
else {
    System.out.println("odd");
}
```

If you need help, feel free to ask :)
Don't forget to commit after you finished this exercise!

#### Exercise 5:

In exercise five we have to use the ``Scanner`` class to read in a String and print it out again.

You do not have to import the class, as this is already done.

When you look at the ``UserInputScanner.java`` class you can see how that can be done.

If you need help, feel free to ask :)
Don't forget to commit after you finished this exercise!

### 8. When you have finished and committed all the exercises, create a pull request for your branch and set another team member to review your pull request.

In GitHub Desktop you can create a pull request for your branch by clicking on the blue button.
Then you get forwarded to GitHub in your browser and can edit your pull request.
Make sure to add a team member as reviewer to your pull request.

### 9. Look at your emails/GitHub if you have to review a pull request yourself and do so if possible.

You can see all pull requests of the repository here: https://github.com/JohannesHufnagl/git_java_tutorial/pulls
Look if you are set to review one and review it, by looking at the changes made from your colleague and comment on it if there are problems or if it is ok.

### 10. Fix problems on your pull request if your reviewer has found any.

When your pull request is reviewed by a colleague you will get an email, or you can see it when you open it https://github.com/JohannesHufnagl/git_java_tutorial/pulls
If there are problems, fix them in IntelliJ, create a new commit and push it to GitHub from GitHub Desktop. 

### 11. Merge your pull request if the reviewer gives her/his ok.

If everything is ok with your pull request, you can click on the merge button and bring your changes to the main branch.

### 12. Close your issue. -> Finished, excellent!

After merging your branch to main, you can close your issue here: https://github.com/JohannesHufnagl/git_java_tutorial/issues
Closing an issue expresses, that your work is finished.