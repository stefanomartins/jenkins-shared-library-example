def call(params) {
    stage("Segundo estágio") {
        print("Recebi a mensagem ${params["ma"]}")
    }
}