# Consumer Review Lab

For each of the activities, add appropriate code in the `main` method of `ReviewTest.java` file so that it runs the method(s) you're writing.  

## Activity 1 - Introduction to Reviews and Sentiment Values
Before you begin filling out the lab manual, read two to three online reviews of your choice. Some options include
music reviews, game reviews, movie reviews, or restaurant reviews.  If you're not sure where to find reviews, discuss it with your partner and see what you can figure out.

In this and other labs in this course, you will be interacting with classes that you have not written yourself. This is a useful and necessary skill, and one that you have already been using by interacting with the String and Math classes. For this
lab you‘ll be using the `Review` class. This class has several existing methods and utilizes the *sentiment value* of words, which is a numerical value for the positive or negative connotation of a word. It’s not necessary that you understand all of the
code contained in this class, but you should take a minute to look at the public methods provided. 

Now take a look at the [sentiment value list](cleanSentiment.csv).  This is a big list, and as with any set of data it’s important to know how it was generated. 

**Discuss with your partner how you think the data was generated.**

<details><summary>CLICK ME AFTER YOUR DISCUSSION</summary>
<p>

Words derive their sentiment value from the context in which they appear. Computer programs examine large amounts of text, calculating how often a word appears in relation to the words around it, and whether the context is positive or negative. The more often a word is used in a positive context, the higher the sentiment value. The overall pool of text being examined determines whether a word has a positive or negative sentiment value. For example, if sports articles make up the bulk of the text, a word may have a different sentiment value than if the text comes from historical biographies.

This list represents only one possible sentiment value of each word given, and it is possible that you could disagree with whether a word is positive or negative. This list was taken from a larger natural language processing (NLP) project from
[Stanford](https://nlp.stanford.edu/projects/socialsent/) and was modified to combine the top 5,000 frequent words from 2000–2010 and adjectives that occurred more than 100 times in the examined text during the same timeframe. Words that could be
considered inappropriate have been removed.  Analysis of sentiment values is helpful when monitoring posts on social media to understand public opinion.

</p>
</details>



### Complete the activity in the lab handout.  Put your code in a void method called activity1()
At the bottom of the handout, share a couple examples of surprising sentiment values you found during the exercise either through your  calls to the sentimentVal method or by looking at the list.  Why are they surprising?  Why might it have happened?
<details><summary>For Example</summary>
<p>
“acceptable,” has a negative sentiment value although we typically think of a “acceptable” as having a positive connotation. This
might be because the word “acceptable” typically appears in a negative sentence. Both “accept” and “accepted” have positive sentiment values.
  </p>
  </details>

## Activity 2
Follow the instructions in the lab.

Special notes:

* Work with your partner to discuss the algorithm for determining the total sentiment of a review (a string with multiple words, each of which will have a sentiment value).  

* Use your algorithm to complete the implement the `totalSentiment` method described in the instructions.

* The `starRating` method, should return a value between 0 and 4, based on the sentiment value of a review.  


## Activity 3
In this activity you will write and test a method that will autogenerate a review from the review used in Activity 2. The method will create a new fake review by replacing **adjectives** in the given review with randomly selected adjectives.

An [adjective](https://simple.wikipedia.org/wiki/Adjective) is a word that describes a noun.

### Positive adjectives vs. Negative adjectives
Positive and negative adjectives are contextual, that is, it depends on how their used.  An example of a negative adjective might be *terrible*, while a positive adjective might be *excellent*.  

With your partner, begin to generate lists of positive and negative adjectives that appear in a single review. You can look back on the reviews you read for the first activity, or you can find new reviews to look at to help generate adjectives. Note that because sentiment is subjective, it is not necessarily the case that words chosen as negative adjectives will have a negative sentiment value. The same is true for words that are chosen as positive adjectives.

Follow the instructions in the lab.

Be sure to add/commit/push `positiveAdjectives.txt` and `negativeAdjectives.txt`.

<details><summary>If you're unsure what the fakeReview method should do</summary>
<p>
Pseudocode:
<ul>
  <li> Use the <code>textToString</code> method from <code>Review.java</code> to create a string containing the contents of your annotated review.</li>
  <li>Create an empty string to store the fake review</li>
  <code>String fakeReview = “”;</code>
  <li>Loop over the words in the original review; if the word is an adjective (i.e.,begins with “*”):
    <ul>
      <li>Call the <code>getPunctuation</code> method to store the ending punctuation of the word in <code>endingPunctuation</code></li>
      <li>Call the <code>randomAdjective</code> method and store the return in <code>randomAdj</code></li>
      <li>Concatenate <code>randomAdj + endingPunctuation</code> onto <code>fakeReview</code></li>
    </ul></li>
  <li>If the word is not an adjective, just concatenate the original word onto <code>fakeReview</code></li>.
  <li>Once all of the words have been processed, return the string <code>fakeReview</code>.</li>
  </ul>
  </p>
  </details>

## Activity 4
In this activity, you will modify the method you completed in the previous activity to create a review that is either more positive or more negative than the original. 

Before you answer questions related to autogenerating reviews, discuss the ethical implications of autogenerated reviews with your partner:
### Question: What responsibility or liability would a programmer have if the code they wrote were used to autogenerate reviews?

For this activity, instead of just *changing* the `fakeReview` method, create a new method called `activity4` with the same return type and parameters as `fakeReview`.  
