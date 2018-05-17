package com.tanna.listgriddemo

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_listview.*
import com.tanna.listgriddemo.DataClass.Employe
import com.tanna.listgriddemo.adapters.MyListAdapter

class ListViewActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_listview)

        var adapter : MyListAdapter? = null
        var empList : ArrayList<Employe>
        empList = generateEmployeeData()
        adapter = MyListAdapter(this, empList)

        list.adapter = adapter

        list.setOnItemClickListener { adapterView, view, i, l ->
            Toast.makeText(this, "Selected Emp is = "+ empList.get(i).emp_name, Toast.LENGTH_SHORT).show()
        }
    }

    private fun generateEmployeeData(): ArrayList<Employe> {
        var result = ArrayList<Employe>()

        var emp: Employe = Employe()
        emp.emp_id = 1
        emp.emp_name = "John Clington"
        emp.emp_designation = "CEO"
        emp.emp_salary = "USD 21000$"
        emp.emp_photo = R.drawable.p1
        result.add(emp)

        emp = Employe()
        emp.emp_id = 2
        emp.emp_name = "Grey Jonathan"
        emp.emp_designation = "Senior Developer"
        emp.emp_salary = "USD 11000$"
        emp.emp_photo = R.drawable.p2
        result.add(emp)

        emp = Employe()
        emp.emp_id = 3
        emp.emp_name = "Barbara Young"
        emp.emp_designation = "Senior Developer"
        emp.emp_salary = "USD 10000$"
        emp.emp_photo = R.drawable.p3
        result.add(emp)

        emp = Employe()
        emp.emp_id = 4
        emp.emp_name = "Brown Williomsan"
        emp.emp_designation = "Developer"
        emp.emp_salary = "USD 8000$"
        emp.emp_photo = R.drawable.p4
        result.add(emp)

        emp = Employe()
        emp.emp_id = 5
        emp.emp_name = "Linda Adams"
        emp.emp_designation = "Developer"
        emp.emp_salary = "USD 8000$"
        emp.emp_photo = R.drawable.p5
        result.add(emp)

        emp = Employe()
        emp.emp_id = 6
        emp.emp_name = "Mark Martin"
        emp.emp_designation = "Developer"
        emp.emp_salary = "USD 7000$"
        emp.emp_photo = R.drawable.p6
        result.add(emp)

        emp = Employe()
        emp.emp_id = 7
        emp.emp_name = "Steven Taylor"
        emp.emp_designation = "Developer"
        emp.emp_salary = "USD 7000$"
        emp.emp_photo = R.drawable.p7
        result.add(emp)

        emp = Employe()
        emp.emp_id = 8
        emp.emp_name = "Nancy Nelson"
        emp.emp_designation = "Developer"
        emp.emp_salary = "USD 7000$"
        emp.emp_photo = R.drawable.p8
        result.add(emp)


        emp = Employe()
        emp.emp_id = 9
        emp.emp_name = "Sarah Campbell"
        emp.emp_designation = "Developer"
        emp.emp_salary = "USD 7000$"
        emp.emp_photo = R.drawable.p9
        result.add(emp)


        emp = Employe()
        emp.emp_id = 10
        emp.emp_name = "Helen Baker"
        emp.emp_designation = "Developer"
        emp.emp_salary = "USD 7000$"
        emp.emp_photo = R.drawable.p10
        result.add(emp)

        return result
    }

}
