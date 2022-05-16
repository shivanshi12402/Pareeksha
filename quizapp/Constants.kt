package com.quizapp

import com.quizapp.R
import com.quizapp.Question

object Constants {

    // TODO (STEP 1: Create a constant variables which we required in the result screen.)
    // START
    const val USER_NAME: String = "user_name"
    const val TOTAL_QUESTIONS: String = "total_questions"
    const val CORRECT_ANSWERS: String = "correct_answers"
    // END
    
    fun getQuestions(): ArrayList<Question> {
        val questionsList = ArrayList<Question>()

        // 1
        val que1 = Question(
            1, "Which of these best describes an array?",

            "A data structure that shows a heirachial behavioue", "Container of objects of similar type",
            "Arrays are immutable once initialised", "Array is not a data structure", 2
        )

        questionsList.add(que1)

        // 2
        val que2 = Question(
            2, "Which of the following is an linear data structure?",

            "Array", "Avial tree",
            "Binary tree", "Graph", 1
        )

        questionsList.add(que2)

        // 3
        val que3 = Question(
            3, "Which of the following is not a type of queue?",

            "Priority queue", "Single-ended queue",
            "Circular queue", "Ordinary queue", 2
        )

        questionsList.add(que3)

        // 4
        val que4 = Question(
            4, "How is an array initialised in C language?",

            "int a[3] = {1,2,3};", "int a = {1,2,3};",
            "int a[] = new int[3]", "Array is not a data structure", 1
        )

        questionsList.add(que4)

        // 5
        val que5 = Question(
            5, "How is the 2nd element in an array accessed based on pointer notation?",
            "*a+2", "*(a+2)",
            "*a2", "&(a+2)", 2
        )

        questionsList.add(que5)

        // 6
        val que6 = Question(
            6, "From the following which is not the operation of data structure?",
            "From the following which is not the operation of data structure?", "Operations that perform a computation",
            "Operations that check for syntax error", "Operations that monitor an object for the occurence of a controlling event", 3
        )

        questionsList.add(que6)

        // 7
        val que7 = Question(
            7, "How are string represented in memory in C?",
            "How are string represented in memory in C?", "The object of some class",
            "The object of some class", "Linked list characters", 1
        )

        questionsList.add(que7)

        // 8
        val que8 = Question(
            8, "What function is used to append a character at the back of a string in C++?",

            "push_back()", "append()",
            "push()", "insert()", 1
        )

        questionsList.add(que8)

        // 9
        val que9 = Question(
            9, "What function is used to append a character at the back of a string in C++?",
            "Overflow", "Underflow",
            "Syntax error", "Garbage value", 2
        )

        questionsList.add(que9)

        // 10
        val que10 = Question(
            10, "What function is used to append a character at the back of a string in C++?",
            "Stck", "Array",
            "LinkList", "None", 1
        )

        questionsList.add(que10)

        return questionsList
    }
}