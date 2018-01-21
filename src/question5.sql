# I had a problem with my system variables and could not fixed it in time for importing the SQL file.
# I could only see the tables and their fields. =\
# The answer to the second question is the same but change to MIN function in line 19.

#	lines 19-26: worker with the max salary in the company
#	lines 28-32: user's current deparment
#	lines 34-39: current manager of each department
#	line 40 : get name and birthday

SELECT e.emp_no,
 e.first_name,
 e.last_name,
 e.birthday,
 max_salary.maxed_salary,
 curr_department.dept_name,
 curr_manager.manager_first_name,
 curr_manager.manager_last_name
FROM
(
SELECT maxed.max_salary AS maxed_salary, salaries.emp_no AS emp_no FROM 
	(
		SELECT MAX(salary) AS max_salary
		FROM salaries
		WHERE date_from <= CURDATE() AND date_to >= CURDATE()
	) maxed LEFT JOIN salaries ON maxed.max_salary = salaries.salary
) max_salary
JOIN
(
	SELECT dept_no, emp_no, d.dept_name AS dept_name
	FROM current_dept_emp JOIN
	departments d ON d.dept_no = dept_no 
) curr_department ON max_salary.emp_no = curr_department.emp_no
JOIN
(
	SELECT dept_no, emp_no, e.first_name AS manager_first_name, e.last_name AS manager_last_name
	FROM dept_manager JOIN
	employees e ON emp_no = e.emp_no
	WHERE date_from <= CURDATE() AND date_to >= CURDATE()
) curr_manager ON curr_department.dept_no = curr_manager.dept_no
LEFT JOIN employees e ON max_salary.emp_no = e.emp_no 