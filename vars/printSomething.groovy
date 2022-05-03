def call(Map params) {
    stage("First stage") {
        print("Recebi a mensagem ${params["ma"]}")
    }
}