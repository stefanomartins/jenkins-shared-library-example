def call(Map params) {
    node(label: params.node) {
        printSomething params
        printSomethingElse params
    }
}