when 'TO DO', {
    'success' should: 'Done'
}

when 'Done', {
    'failure' should: 'To Do'
}

when 'In Progress', {
    'success' should: 'Done'
}