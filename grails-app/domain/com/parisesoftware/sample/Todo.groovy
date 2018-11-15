package com.parisesoftware.sample

class Todo {

    String  description
    boolean isComplete

    static constraints = {
        description blank: false
        isComplete  blank: false
    }

}
