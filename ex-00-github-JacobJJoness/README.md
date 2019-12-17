# Setting Up Git/Github
This may be your first experience with using Git and Github for a while, so be patient, learn a lot and **ASK QUESTIONS**!!

Git has already been installed on the computers here at school. Open a command prompt, and change to your APCSA folder: *cd APCSA* (If you don't have the APCSA folder, make it using `mkdir APCSA`

We need to configure Git to know who you are.  Type the following in at the prompt:

`git config --global user.email "your@emailaddress"`

`git config --global user.name "your name"`

# Cloning a repository
Towards the top of this page is a green button that says "Clone or Download." Click it, make sure it says "Clone with HTTPS" in bold letters, if not click the blue hyperlink to make it clone with HTTPS.  Then click the little clipboard icon with the arrow.

Go back to your command prompt and type in: *git clone* then press *ctrl shift v* to paste the link in.  Press Enter.

Something should happen.  (Not an error)

# Using Git/Github
Git is "version control system".  Think of it as a way to save every version of your program as you develop it.

Open the "Ex00-Github-####" folder in Visual Studio Code.  Open HelloWorld.java and edit the program so that it will print your name in the indicated places.

Compile and Run the program:
* Go to Terminal | New Terminal
* Type in `javac HelloWorld.java`  -- nothing should show up
* Type in `java HelloWorld`

When it's working, go back to the command prompt and type

* *git add HelloWorld.java*
* *git commit -m "add my name"*

If everything looks ok (as in, no errors appear) type:

* *git push* 

You will need to type in the e-mail address and password for Github that you created.

**Note**: You may want to write down the above instructions, as you will be using these commands quite a bit, and at first, you won't remember them!

This will upload all of your work from class to Github where I can look at it, and you can access it from elsewhere if needed.  

As you work and complete various parts of your programs this year, you should periodically go to the command line and add/commit/push.  Generally you want to commit after you get some new feature working (or partially working), and definitely at the end of class period.  You only need to *push* at the end of the period before logging out so it will save your work online.

During your projects throughout the year, I am expecting to see regular "commits" and should see your "push" at the end of each class period!  Get in the habit of doing this NOW. 

# Submission
After you have add/commit/push'd this working program, you're done.  Go to Google Classroom and accept the next assignment, BaseChanger.
