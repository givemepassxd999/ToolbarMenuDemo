package example.givemepass.toolbarmenudemo

import android.app.Dialog
import android.content.Context
import android.widget.Toast
import kotlinx.android.synthetic.main.my_dialog.*

class MyDialog(private val mContext: Context) : Dialog(mContext, R.style.MyDialogTheme) {
    init {
        setContentView(R.layout.my_dialog)
        toolbar.title = "Toolbar Demo"
        toolbar.setNavigationIcon(R.drawable.ic_keyboard_arrow_left_24dp)
        toolbar.setNavigationOnClickListener { dismiss() }
        toolbar.inflateMenu(R.menu.menu_layout)
        toolbar.setOnMenuItemClickListener{
            when (it.itemId) {
                R.id.menu_edit -> Toast.makeText(mContext, "Edit is clicked!", Toast.LENGTH_SHORT).show()
            }
            false
        }
    }
}
