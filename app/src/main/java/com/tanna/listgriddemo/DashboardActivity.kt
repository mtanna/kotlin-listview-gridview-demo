package com.tanna.listgriddemo

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_listview.*
import com.tanna.listgriddemo.DataClass.Employe
import com.tanna.listgriddemo.adapters.MyListAdapter
import kotlinx.android.synthetic.main.activity_dashboard.*

class DashboardActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dashboard)

        btn_listview.setOnClickListener(View.OnClickListener {
            val intent = Intent(this, ListViewActivity::class.java)
            startActivity(intent)
        })

        btn_gridview.setOnClickListener(View.OnClickListener {
            val intent = Intent(this, GridViewActivity::class.java)
            startActivity(intent)
        })
    }

    private fun generateEmployeeData(): ArrayList<Employe> {
        var result = ArrayList<Employe>()

        var emp: Employe = Employe()
        emp.emp_id = 1
        emp.emp_name = "John Clington"
        emp.emp_designation = "CEO"
        emp.emp_salary = "USD 21000$"
        emp.emp_photo = R.drawable.ic_launcher_background
        result.add(emp)

        emp = Employe()
        emp.emp_id = 2
        emp.emp_name = "Grey Jonathan"
        emp.emp_designation = "Senior Developer"
        emp.emp_salary = "USD 11000$"
        emp.emp_photo = R.drawable.ic_launcher_background
        result.add(emp)

        emp = Employe()
        emp.emp_id = 3
        emp.emp_name = "Brown Williomsan"
        emp.emp_designation = "Developer"
        emp.emp_salary = "USD 8000$"
        emp.emp_photo = R.drawable.ic_launcher_background
        result.add(emp)

        return result
    }

}
