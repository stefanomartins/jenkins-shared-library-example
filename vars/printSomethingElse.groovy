def call(Map params) {
    stage("Second stage") {
        print("Recebi a mensagem ${params["mb"]}")
    }
}