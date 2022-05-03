def call(params) {
    stage("First stage") {
        print("Recebi a mensagem ${params["ma"]}")
    }
}