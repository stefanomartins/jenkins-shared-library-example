def call(params) {
    stage("Second stage") {
        print("Recebi a mensagem ${params["ma"]}")
    }
}