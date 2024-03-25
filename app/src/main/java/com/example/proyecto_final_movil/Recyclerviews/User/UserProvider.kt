package com.example.proyecto_final_movil.Recyclerviews.User

class UserProvider {
    companion object{
        private var user1 = User(1,"luis","lu1s","l613")

        private var user2 = User(2,"fernanda","f3rn4nd4","f3rnanda123")

        private var user3 = User(3,"juan","juan","juanCP")

        private var user4 = User(4,"Juan Jose","JJ","JJ123@")
        var userList = listOf<User>(user1, user2, user3, user4)
    }
}