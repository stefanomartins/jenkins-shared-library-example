def call(paramss) {
    stage("First stage") {
        print("Recebi a mensagem ${params["ma"]}")
    }
}