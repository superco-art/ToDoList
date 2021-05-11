const tasksList= document.querySelector("#task-selection");

// 3)
function showTasks(tasks) {
    tasks.forEach(task => {
        const element = `<div class="tasks">
            <p class="list">(${task.title})</p>
        </div>`;
        tasksList.insertAdjacentHTML("beforeend", element)
    })
}


// 2)
let loadTasks = () => {
    fetch("/tasks")
        .then(r => r.json())
        .then(showTasks)
};

// 1)
document.addEventListener("DOMContentLoaded", loadTasks)