## Instructions
There are tasks to be done across a few files in `src/main/java`, all marked with `TODO`s. We recommend doing them in the order:

1. `Trader.java`
2. `DrivableTrader.java`
3. `DrivableMap.java`

The other files are provided for reference and testing purposes. These files are:

1. `Domesticatable.java`, `Drivable.java`, and `Tradable.java`: These are the same interfaces as the ones in Lab 3.
2. `DomesticatableTrader.java`: An example of a subclass of the Trader class. This should work once you complete `Trader.java`. Use this as a reference for `DrivableTrader.java`.
3. `Horse.java` and `Unicorn.java`: Sample classes that implement the given interfaces.

You do *NOT* need to change these files, and you *should not*. Changing them may affect your code.

### Readings
For this exercise, you will want to read through **Chapter 4: Assorted Topics in Java**.

You will also likely find online resources helpful, such as the following Java documentation pages:

- [Java Documentation on Generics](https://docs.oracle.com/javase/8/docs/technotes/guides/language/generics.html)
- [Java Lesson on Generics](https://docs.oracle.com/javase/tutorial/java/generics/index.html)
- [ArrayList API](https://docs.oracle.com/javase/8/docs/api/java/util/ArrayList.html)


### IntelliJ Reminders
Make sure you set the folder `java` under `src/main` as Sources Root in order to get hints from IntelliJ. Similarly, you can set the folder `java` under `src/test` as Test Sources Root in order to run the tests we've provided.
Alternatively, you might find it convenient to open just this directory as a project in IntelliJ while working on your code.


### Automarker results
After you add, commit, **and** push your changes to GitHub, the test cases given to you will automatically run. This may take a few minutes.

To access the results, go to the "Actions" tab from your GitHub repository. You should see a list of workflows: click on the top-most (most recent) run. In this, you should see the points at the bottom (e.g. the number of test cases you passed) along with an **Autograding** job above it: if you click on **Autograding**, you can see the results. Expand the `Run education/autograding@v1` part to see a full log of the results.