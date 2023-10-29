fun main(strings: Array<String>) {

    val listview = ListView(arrayOf("annie", "hector", "nic", "bridget"));
    listview.ListViewItem().displayItem(1);
}


class ListView(val items: Array<String>) {


    inner class ListViewItem {

        fun displayItem(position: Int) {
            println(items[position]);
        }
    }
}