package com.example.linkdevinternship

data class SingleChat (
    val imageURL:Int=R.drawable.ic_man_face_24,
    val senderName:String="Name",
    val senderMessage:String="Message",
    val sentMessageTime:String="00:00"
){

    companion object{
        fun createTempChats(): ArrayList<SingleChat>{
            return arrayListOf(
                SingleChat(R.drawable.ic_man_face_24,"Mohamed","Hello","10:30"),
                SingleChat(R.drawable.ic_woman_face_4_24,"Link","welcome","22:45") ,
                SingleChat(R.drawable.ic_man_face_24,"Mostafa","where are you","9:10"),
                SingleChat(R.drawable.ic_woman_face_4_24,"Sara","i am here","15:35"),
                SingleChat(R.drawable.ic_man_face_24,"Mohamed","Hello","10:30"),
                SingleChat(R.drawable.ic_woman_face_4_24,"Link","welcome","22:45") ,
                SingleChat(R.drawable.ic_man_face_24,"Mostafa","where are you","9:10"),
                SingleChat(R.drawable.ic_woman_face_4_24,"Sara","i am here","15:35"),
                SingleChat(R.drawable.ic_man_face_24,"Mohamed","Hello","10:30"),
            SingleChat(R.drawable.ic_woman_face_4_24,"Link","welcome","22:45") ,
            SingleChat(R.drawable.ic_man_face_24,"Mostafa","where are you","9:10"),
            SingleChat(R.drawable.ic_woman_face_4_24,"Sara","i am here","15:35")


            )
        }
    }
}