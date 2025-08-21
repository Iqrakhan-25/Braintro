package com.example.braintro

import android.app.AlertDialog
import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.*
import androidx.appcompat.app.AppCompatActivity
import com.example.braintro.model.Category

class CategoryActivity : AppCompatActivity() {

    private val categories = listOf(
        Category("General Knowledge", R.drawable.ic_gk),
        Category("Science", R.drawable.ic_science),
        Category("History", R.drawable.ic_history),
        Category("Geography", R.drawable.ic_geography),
        Category("Mathematics", R.drawable.ic_math),
        Category("Sports", R.drawable.ic_sports),
        Category("Technology", R.drawable.ic_technology),
        Category("Literature", R.drawable.ic_literature),
        Category("Music", R.drawable.ic_music),
        Category("Movies", R.drawable.ic_movie),
        Category("Art", R.drawable.ic_art),
        Category("Politics", R.drawable.ic_politics),
        Category("Current Affairs", R.drawable.ic_currentaffairs),
        Category("Computer Science", R.drawable.ic_computer),
        Category("Animals", R.drawable.ic_animal),
        Category("Food & Drinks", R.drawable.ic_food)
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_category)

        val categoryGridView = findViewById<GridView>(R.id.categorygridView)
        val adapter = CategoryAdapter(this, categories)
        categoryGridView.adapter = adapter

        categoryGridView.onItemClickListener =
            AdapterView.OnItemClickListener { _, _, position, _ ->
                showNameDialog(categories[position].name)
            }
    }

    private fun showNameDialog(categoryName: String) {
        val dialogView = layoutInflater.inflate(R.layout.dialog_name, null)
        val nameEditText = dialogView.findViewById<EditText>(R.id.nameEditText)

        val dialog = AlertDialog.Builder(this, R.style.CustomDialog)
            .setView(dialogView)
            .setCancelable(true)
            .create()

        dialog.show()

        // Set dialog width to 80% of screen width
        val window = dialog.window
        val params = window?.attributes
        val displayMetrics = resources.displayMetrics
        params?.width = (displayMetrics.widthPixels * 0.87).toInt()
        window?.attributes = params

        dialogView.findViewById<Button>(R.id.okButton).setOnClickListener {
            val playerName = nameEditText.text.toString().trim()
            if (playerName.isEmpty()) {
                nameEditText.error = "Please enter your name"
            } else {
                dialog.dismiss()
                val intent = Intent(this, QuizActivity::class.java)
                intent.putExtra("CATEGORY", categoryName)
                intent.putExtra("PLAYER_NAME", playerName)
                startActivity(intent)
            }
        }
    }

class CategoryAdapter(private val context: Context, private val categories: List<Category>) :
    BaseAdapter() {

    override fun getCount(): Int = categories.size
    override fun getItem(position: Int): Any = categories[position]
    override fun getItemId(position: Int): Long = position.toLong()

    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {
        val view = convertView ?: LayoutInflater.from(context)
            .inflate(R.layout.item_category, parent, false)
        val category = categories[position]

        val icon = view.findViewById<ImageView>(R.id.categoryIconImageView)
        val name = view.findViewById<TextView>(R.id.categoryNameTextView)

        icon.setImageResource(category.icon)
        name.text = category.name

        return view
    }
}}
