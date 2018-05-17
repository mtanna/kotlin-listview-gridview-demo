package com.tanna.listgriddemo

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.tanna.listgriddemo.DataClass.Company
import kotlinx.android.synthetic.main.activity_listview.*
import com.tanna.listgriddemo.DataClass.Employe
import com.tanna.listgriddemo.adapters.MyGridAdapter
import com.tanna.listgriddemo.adapters.MyListAdapter
import kotlinx.android.synthetic.main.activity_gridview.*

class GridViewActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_gridview)

        var adapter : MyGridAdapter? = null
        var companyList : ArrayList<Company>
        companyList = generateCompanyData()
        adapter = MyGridAdapter(this, companyList)

        grid.adapter = adapter

        grid.setOnItemClickListener { adapterView, view, i, l ->
            Toast.makeText(this, " Selected Company is = "+ companyList.get(i).company_name , Toast.LENGTH_SHORT).show()
        }
    }

    private fun generateCompanyData(): ArrayList<Company> {
        var result = ArrayList<Company>()

        var company: Company = Company()
        company.company_id = 1
        company.company_name = "apple"
        company.company_networth = "USD 1000k$"
        company.company_photo = R.drawable.c1
        result.add(company)

        company = Company()
        company.company_id = 2
        company.company_name = "Samsung"
        company.company_networth = "USD 1000k$"
        company.company_photo = R.drawable.c2
        result.add(company)

        company = Company()
        company.company_id = 3
        company.company_name = "Sony"
        company.company_networth = "USD 1000k$"
        company.company_photo = R.drawable.c3
        result.add(company)

        company = Company()
        company.company_id = 4
        company.company_name = "Redmi"
        company.company_networth = "USD 1000k$"
        company.company_photo = R.drawable.c4
        result.add(company)

        company = Company()
        company.company_id = 5
        company.company_name = "Dell"
        company.company_networth = "USD 1000k$"
        company.company_photo = R.drawable.c5
        result.add(company)

        company = Company()
        company.company_id = 6
        company.company_name = "Nikon"
        company.company_networth = "USD 1000k$"
        company.company_photo = R.drawable.c6
        result.add(company)

        company = Company()
        company.company_id = 7
        company.company_name = "Motorola"
        company.company_networth = "USD 1000k$"
        company.company_photo = R.drawable.c7
        result.add(company)


        company = Company()
        company.company_id = 8
        company.company_name = "Google"
        company.company_networth = "USD 1000k$"
        company.company_photo = R.drawable.c8
        result.add(company)

        company = Company()
        company.company_id = 9
        company.company_name = "Microsoft"
        company.company_networth = "USD 1000k$"
        company.company_photo = R.drawable.c9
        result.add(company)


        company = Company()
        company.company_id = 10
        company.company_name = "Adobe"
        company.company_networth = "USD 1000k$"
        company.company_photo = R.drawable.c10
        result.add(company)

        company = Company()
        company.company_id = 11
        company.company_name = "Intel"
        company.company_networth = "USD 1000k$"
        company.company_photo = R.drawable.c11
        result.add(company)

        company = Company()
        company.company_id = 12
        company.company_name = "Lenovo"
        company.company_networth = "USD 1000k$"
        company.company_photo = R.drawable.c12
        result.add(company)

        company = Company()
        company.company_id = 13
        company.company_name = "Wallmart"
        company.company_networth = "USD 1000k$"
        company.company_photo = R.drawable.c13
        result.add(company)

        company = Company()
        company.company_id = 14
        company.company_name = "Amazon"
        company.company_networth = "USD 1000k$"
        company.company_photo = R.drawable.c14
        result.add(company)

        company = Company()
        company.company_id = 15
        company.company_name = "Flipkart"
        company.company_networth = "USD 1000k$"
        company.company_photo = R.drawable.c15
        result.add(company)


        return result
    }

}
