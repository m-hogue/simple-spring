<jumbotron>
    <div class="jumbotron">
        <h3>Things</h3>
        <table class="table table-striped table-bordered table-hover table-condensed" style="width: 70%;">
            <thead>
            <tr>
                <th>Name</th>
                <th>Value</th>
                <th>Number</th>
            </tr>
            </thead>
            <tbody>
            <tr each={opts.things}>
                <td>{name}</td>
                <td>{value}</td>
                <td>{number}</td>
            </tr>
            </tbody>
        </table>
    </div>
</jumbotron>